import {entrada} from "../models/modelEntrada.js";
// import { alertSuccess } from "./main.js";

const formRegistro = document.querySelector('#formRegistro');
const btnGuardar = document.querySelector('#btnGuardar');
const registros = document.querySelector('#informacionRegistro');

document.addEventListener('DOMContentLoaded', imprimirHTML)

registros.addEventListener('click', eliminarRegistro);
btnGuardar.addEventListener('click', validacionCampos);

function validacionCampos(e) {
  e.preventDefault();

  const inputPlaca = document.querySelector('#lmatricula');
  const radioVehiculo = document.querySelector('input[name=Tarifa]:checked');

  if( inputPlaca.value !== '' && radioVehiculo !== null ) {
    const encontrado = entrada.some( vehiculo => vehiculo.placa == inputPlaca.value.toUpperCase() );

    if( !encontrado ) {
      capturarDatosMatricula( inputPlaca, radioVehiculo );
      alertSuccess("El elemento fue guardado exitosamente!", true)
    } else {
      formRegistro.reset();
      alertSuccess("La placa ya existe en el sistema!", false);
    }
  } else {
    alertSuccess("Complete todos los campos", false);
  }
}

function capturarDatosMatricula( inputPlaca, radioVehiculo ) {
  const datosVehiculo = {
    placa : inputPlaca.value.toUpperCase(),
    tipoVehiculo : radioVehiculo.value,
    fecha : new Date(),
    recibo : Math.random().toString(30).substring(7).toUpperCase()
  }

  agregarVehiculo( datosVehiculo );

  formRegistro.reset();
}

function agregarVehiculo( vehiculo ) {
  entrada.push( vehiculo );
  imprimirHTML();
}

function imprimirHTML() {
  limpiarHTML();

  entrada.forEach( vehiculo => {
    const { placa, tipoVehiculo, fecha, recibo } = vehiculo;

    const fechaNueva = new Date(fecha)

    const tr = document.createElement('TR');
    const tdPlaca = document.createElement('TD');
    tdPlaca.innerText = placa;
    const tdTarifa = document.createElement('TD');
    tdTarifa.innerText = tipoVehiculo;
    const tdHora = document.createElement('TD');
    tdHora.innerText = `${fechaNueva.getHours()}:${fechaNueva.getMinutes() < 10 ? '0'+fechaNueva.getMinutes() : fechaNueva.getMinutes()}`;
    const tdRecibo = document.createElement('TD');
    tdRecibo.innerText = recibo;
    const tdEliminar = document.createElement('TD');
    const imgEliminar = document.createElement('IMG');
    imgEliminar.src = '../img/delete.png';
    imgEliminar.classList.add('delete');
    tdEliminar.appendChild(imgEliminar);
    imgEliminar.setAttribute('data-recibo', recibo);

    tr.append(tdPlaca, tdTarifa, tdHora, tdRecibo, tdEliminar );
    
    registros.appendChild(tr)
  })

  sincronizarLocalStorage();
}

function sincronizarLocalStorage() {
  localStorage.setItem( 'vehiculosEntrada', JSON.stringify(entrada) );
}

function limpiarHTML() {
  while(registros.firstChild) {
    registros.removeChild(registros.firstChild);
  }
}

function eliminarRegistro(e) {
  if( e.target.classList.contains('delete') ) {
    const vehiculoId = e.target.getAttribute('data-recibo');

    const indexId = entrada.findIndex( vehiculo => vehiculo.placa == vehiculoId);

    entrada.splice( indexId, 1 );

    imprimirHTML();
  }
}