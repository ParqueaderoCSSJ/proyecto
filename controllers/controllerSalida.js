import { entrada } from "../models/modelEntrada.js";
import { salida } from "../models/modelSalida.js";

const btnBuscar = document.querySelector('#btnBuscar');
const registros = document.querySelector('#informacionRegistros');

document.addEventListener('DOMContentLoaded', imprimirHTML);

btnBuscar.addEventListener('click', validarCampos);

function validarCampos(e) {
  e.preventDefault();

  const inputPlaca = document.querySelector('#lmatricula');

  if( inputPlaca.value !== '' ) {
    buscarVehiculo(inputPlaca.value.toUpperCase());
  } else {
    alertSuccess("Complete todos los campos", false);
  }
}

function buscarVehiculo( placa ) {

  const indexPlaca = entrada.findIndex( vehiculo => vehiculo.placa == placa);

  if( indexPlaca !== -1 ) {
    calcularValor( indexPlaca );
  } else {
    alertSuccess("La placa no se encuentra en el sistema", false);
  }
}

function calcularValor( indexPlaca ) {

  const { placa, recibo, tipoVehiculo, fecha } = entrada[indexPlaca];

  const fechaEntrada = new Date(fecha);
  const fechaSalida = new Date();

  const diferencia = fechaSalida.getTime() - fechaEntrada.getTime();
  const tiempoHoras = Math.ceil(diferencia/(1000*60*60));

  let valorHora;

  if ( tipoVehiculo === 'Moto') {
    valorHora = 1000;
  } else {
    valorHora = 2000;
  }

  const datosVehiculo = {
    placa,
    recibo,
    fechaEntrada,
    fechaSalida,
    tiempoHoras,
    tipoVehiculo
  }

  mostrarMensaje( indexPlaca, datosVehiculo, valorHora );
}

function mostrarMensaje( indexPlaca, datosVehiculo, valorHora ) {  
  Swal.fire({
    title: `¿Desea facturar ${datosVehiculo.placa}?`,
    html: `<h5>Tiempo: ${datosVehiculo.tiempoHoras} Hora(s)</h5> <h5>Total: $${valorHora * datosVehiculo.tiempoHoras}</h5>`,
    icon: "warning",
    showCancelButton: true,
    confirmButtonColor: "#3085d6",
    cancelButtonColor: "#d33",
    confirmButtonText: "Sí, facturar"
  }).then((result) => {
    if (result.isConfirmed) {
      alertSuccess("Se ha facturado exitosamente", true);
      eliminarEntrada( indexPlaca, datosVehiculo );
    }
  });
}

function eliminarEntrada( placa, datosVehiculo ) {
  entrada.splice( placa, 1 );

  sincronizarLocalStorageEntrada();
  agregarVehiculoSalida( datosVehiculo )
}

function sincronizarLocalStorageEntrada() {
  localStorage.setItem( 'vehiculosEntrada', JSON.stringify(entrada) );
}

function agregarVehiculoSalida( datosVehiculo ) {
  salida.push(datosVehiculo);
  imprimirHTML();
}

function imprimirHTML() {

  eliminarHTML();
  
  salida.forEach( vehiculo => {
    const { fechaSalida, fechaEntrada, placa, recibo, tiempoHoras, tipoVehiculo } = vehiculo;

    const fechaNuevaEntrada = new Date(fechaEntrada);
    const fechaNuevaSalida = new Date(fechaSalida);

    const tr = document.createElement('TR');
    const tdPlaca = document.createElement('TD');
    tdPlaca.innerText = placa;
    const tdTarifa = document.createElement('TD');
    tdTarifa.innerText = tipoVehiculo;
    const tdHoraEntrada = document.createElement('TD');
    tdHoraEntrada.innerText = `${fechaNuevaEntrada.getHours()}:${fechaNuevaEntrada.getMinutes() < 10 ? '0'+fechaNuevaEntrada.getMinutes() : fechaNuevaEntrada.getMinutes()}`;
    const tdHoraSalida = document.createElement('TD');
    tdHoraSalida.innerText = `${fechaNuevaSalida.getHours()}:${fechaNuevaSalida.getMinutes() < 10 ? '0'+fechaNuevaSalida.getMinutes() : fechaNuevaSalida.getMinutes()}`;
    const tdTiempo = document.createElement('TD');
    tdTiempo.innerText = tiempoHoras;
    const tdRecibo = document.createElement('TD');
    tdRecibo.innerText = recibo;

    tr.append(tdPlaca, tdTarifa, tdHoraEntrada, tdHoraSalida, tdTiempo, tdRecibo );

    registros.appendChild(tr);
  } )

  sincronizarLocalStorageSalida();
}

function sincronizarLocalStorageSalida() {
  localStorage.setItem( 'vehiculosSalida', JSON.stringify(salida) );
}

function eliminarHTML() {
  while(registros.firstChild) {
    registros.removeChild(registros.firstChild)
  }
}