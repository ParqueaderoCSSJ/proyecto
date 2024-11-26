import { tiempos } from "../models/modelMensualidad.js";

export function registroEntradaSalida() {
    let matricula = document.getElementById('matricula').value
    let diaEntrada = document.getElementById('diaEntrada').value
    let diaSalida = document.getElementById('diaSalida').value
    let recibo = document.getElementById('Recibo')

    let tarifa = 0
    let mototarifa = document.getElementById('moto')
    let carrotarifa = document.getElementById('carro')

    if (mototarifa.checked) {
        tarifa = "$2.500"
    } else if (carrotarifa.checked) {
        tarifa = "$5.000"
    }

    if (!matricula || !diaEntrada || !diaSalida || !tarifa) {
        var msg = "Por favor, completa todos los datos";
        alertSuccess(msg, false);
    }
    else {
        let totalDias = calcularDias(diaEntrada, diaSalida)
        let newRegistro = {
            matricula: matricula,
            diaEntrada: diaEntrada,
            diaSalida: diaSalida,
            tarifa: tarifa,
            totalDias: totalDias,
            recibo: Math.random().toString(30).substring(7).toUpperCase()
        }
        tiempos.push(newRegistro)
        console.log(tiempos)
        crearNuevoRegistro(newRegistro)

        var msg = "Ingresado con éxito";
        alertSuccess(msg, true);
        document.getElementById('form_Mensualidad').reset();
    }
}

function crearNuevoRegistro(newRegistro) {
    let registro = document.createElement('tr')
    let matricula = document.createElement('td')
    let diaEntrada = document.createElement('td')
    let diaSalida = document.createElement('td')
    let tarifa = document.createElement('td');
    let totalDias = document.createElement('td');
    let recibo = document.createElement('td');

    const eliminar = document.createElement('td');
    const imgEliminar = document.createElement('img');
    imgEliminar.src = '../img/delete.png';
    imgEliminar.alt = 'Eliminar';
    imgEliminar.classList.add('delete');
    imgEliminar.style.cursor = 'pointer';
    imgEliminar.addEventListener('click', () => eliminarRegistro(registro, newRegistro));
    eliminar.appendChild(imgEliminar);

    matricula.textContent = newRegistro.matricula
    diaEntrada.textContent = newRegistro.diaEntrada
    diaSalida.textContent = newRegistro.diaSalida
    tarifa.textContent = newRegistro.tarifa
    totalDias.textContent = newRegistro.totalDias;
    recibo.textContent = newRegistro.recibo
    registro.append(matricula, tarifa, diaEntrada, diaSalida, totalDias, recibo, eliminar)
    console.log(registro)
    document.getElementById('registros').append(registro)
}

function eliminarRegistro(fila) {
    fila.remove();
}

function calcularDias(diaEntrada, diaSalida) {
    let fechaEntrada = new Date(diaEntrada);
    let fechaSalida = new Date(diaSalida);

    if (isNaN(fechaEntrada.getTime()) || isNaN(fechaSalida.getTime())) {
        return 0;
    }

    let diferenciaMilisegundos = fechaSalida.getTime() - fechaEntrada.getTime();

    let diferenciaDias = diferenciaMilisegundos / (1000 * 60 * 60 * 24);

    return Math.round(diferenciaDias);
}

let buttomGuardar = document.getElementById('guardar')
if (buttomGuardar) {
    buttomGuardar.addEventListener('click', registroEntradaSalida)
}
