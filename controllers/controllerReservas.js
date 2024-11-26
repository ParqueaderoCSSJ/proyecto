import { Registros} from "../models/modelReservas.js";

export function registrarRegistros() {
    const placa = document.getElementById('lmatricula').value;
    const diaEntrada = document.getElementById('ldia_entrada').value;
    const diaSalida = document.getElementById('ldia_salida').value;
    const tarifa = document.querySelector('input[name="Tarifa"]:checked');

    if (!placa || !diaEntrada || !diaSalida || !tarifa) {
        var msg = "Por favor, completa todos los datos";
        alertSuccess(msg, false);
    } else {
        const fechaEntrada = new Date(diaEntrada);
        const fechaSalida = new Date(diaSalida);
        const totalDias = Math.ceil((fechaSalida - fechaEntrada) / (1000 * 60 * 60 * 24));
    
        const newRegistro = {
            placa: placa,
            tarifa: tarifa.value,
            diaEntrada: diaEntrada,
            diaSalida: diaSalida,
            totalDias: isNaN(totalDias) || totalDias < 0 ? 0 : totalDias
        };
    
        Registros.push(newRegistro);
        console.log(newRegistro);
        crearRegistroTiempo(newRegistro);
    
        var msg = "Ingresado con éxito";
        alertSuccess(msg, true);
        document.getElementById('form_reservas').reset();
    }
}

function crearRegistroTiempo(newRegistro) {
    const registro = document.createElement('tr');

    const placa = document.createElement('td');
    placa.textContent = newRegistro.placa;

    const tarifa = document.createElement('td');
    tarifa.textContent = newRegistro.tarifa;

    
    const diaEntrada = document.createElement('td');
    diaEntrada.textContent = formatDate(newRegistro.diaEntrada);

    const diaSalida = document.createElement('td');
    diaSalida.textContent = formatDate(newRegistro.diaSalida);

    const totalDias = document.createElement('td');
    totalDias.textContent = newRegistro.totalDias;

    const eliminar = document.createElement('td');
    const imgEliminar = document.createElement('img');
    imgEliminar.src = '../img/delete.png';
    imgEliminar.alt = 'Eliminar';
    imgEliminar.classList.add('delete');
    imgEliminar.style.cursor = 'pointer';
    imgEliminar.addEventListener('click', () => eliminarRegistro(registro, newRegistro));
    eliminar.appendChild(imgEliminar);

    registro.append(placa, tarifa, diaEntrada, diaSalida, totalDias, eliminar);

    document.getElementById('registros').appendChild(registro);
}


function formatDate(dateString) {
    const date = new Date(dateString);
    return date.toLocaleString('es-ES', {
        dateStyle: 'short',
        timeStyle: 'short',
    }); 
}


function eliminarRegistro(fila) {
    fila.remove();
}

document.getElementById('btnRegistrar').addEventListener('click', registrarRegistros);