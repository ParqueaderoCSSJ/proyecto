document.addEventListener('DOMContentLoaded', functionArray)

function functionArray() {
  let salida = JSON.parse(localStorage.getItem('vehiculosSalida')) || [];
  return salida
}

export let salida = functionArray();