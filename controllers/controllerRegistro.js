import { registros } from "../models/modelRegistro.js";

document.addEventListener('DOMContentLoaded', imprimirHTML)

const formulario = document.querySelector('#formularioRegistro');
const infoRegistro = document.querySelector('#informacionRegistro');

const btnGuardar = document.querySelector('#btnGuardar');

// agregarUsuario(usuarioObj);
//         Swal.fire({
//           title: "Éxito!",
//           text: "El elemento fue guardado exitosamente!",
//           icon: "success"
//         });
//         formulario.reset();

btnGuardar.addEventListener('click', validacionDeCampos);

function validacionDeCampos(e) {
  e.preventDefault();
  
  const tipoDocumento = document.querySelector('#tipoDocumento').value.toLowerCase();
  const documento = document.querySelector('#Documento').value.toLowerCase();
  const nombre = document.querySelector('#Nombre').value.toLowerCase();
  const radioSexo = document.querySelector('input[name=sexo]:checked');
  const apellido = document.querySelector('#Apellido').value.toLowerCase();
  const telefono = document.querySelector('#Telefono').value.toLowerCase();
  const correo = document.querySelector('#Correo').value.toLowerCase();
  const roll = document.querySelector('#Rol').value.toLowerCase();
  const user = document.querySelector('#Usuario').value;
  const password = document.querySelector('#Contrasena').value;
  const confirmar = document.querySelector('#Confirmar').value;
  
  if(tipoDocumento !== '' && documento !== '' && nombre !== '' && radioSexo !== null && apellido !== '' && telefono !== '' && correo !== '' && roll !== '' && user !== '' && password !== '' && confirmar !== '') {
    if( password === confirmar ) {
      validacionDuplicados( tipoDocumento, documento, nombre, radioSexo.value, apellido, telefono, correo, roll, user, password);  
    } else {
      Swal.fire({
        title: "Error!",
        text: "Las contraseñas deben de ser iguales",
        icon: "error"
      });
    }
  } else {
    Swal.fire({
      title: "Error!",
      text: "Complete todos los campos",
      icon: "error"
    });
  }
}

function validacionDuplicados(tipoDocumento, documento, nombre, radioSexo, apellido, telefono, correo, roll, user, password) {
  const encontradoDocumento = registros.some( usuario => usuario.documento === documento );
  const encontradoUser = registros.some( usuario => usuario.user === user );
  const encontradoEmail = registros.some( usuario => usuario.correo === correo );

  if( encontradoDocumento ) {
    Swal.fire({
      title: "Error!",
      text: "Documento de identidad ya existe",
      icon: "error"
    });
    return;
  }
  if( encontradoUser ) {
    Swal.fire({
      title: "Error!",
      text: "Usuario ya existe",
      icon: "error"
    });
    return;
  }
  if( encontradoEmail ) {
    Swal.fire({
      title: "Error!",
      text: "Email ya existe",
      icon: "error"
    });
    return;
  }

  const usuarioObj = {
    tipoDocumento,
    documento,
    nombre,
    radioSexo, 
    apellido,
    telefono,
    correo,
    roll,
    user,
    password
  }

  agregarUsuario(usuarioObj);
}

function agregarUsuario(usuarioObj) {
  registros.push(usuarioObj);
  formulario.reset();
  Swal.fire({
    title: "Éxito!",
    text: "El elemento fue guardado exitosamente!",
    icon: "success"
  });
  
  imprimirHTML();
}

function imprimirHTML() {
  registros.forEach( registros => {
    
    const {tipoDocumento,documento, nombre, radioSexo, apellido, telefono, correo, roll, user, password} = registros;
    
    const tr = document.createElement('TR');
    const tdDocumento = document.createElement('TD');
    tdDocumento.innerText = `${tipoDocumento.toUpperCase()} ${documento}`;
    const tdNombre = document.createElement('TD');
    tdNombre.innerText = `${nombre.charAt(0).toUpperCase() + nombre.slice(1)} ${apellido.charAt(0).toUpperCase() + apellido .slice(1)} `;
    const tdTelefono = document.createElement('TD');
    tdTelefono.innerText = telefono;
    const tdRol = document.createElement('TD');
    tdRol.innerText = roll;
    const tdCorreo = document.createElement('TD');
    tdCorreo.innerText = correo;
    const tdUsuario = document.createElement('TD');
    tdUsuario.innerText = user;
    const tdAcciones = document.createElement('TD');
    const imgEliminar = document.createElement('IMG');
    imgEliminar.src = '../img/delete.png';
    imgEliminar.classList.add('delete');
    tdAcciones.appendChild(imgEliminar);
    imgEliminar.setAttribute('data-documento', documento);
    const imgEditar = document.createElement('IMG');
    imgEditar.src = '../img/editar.png';
    imgEditar.classList.add('editar');
    tdAcciones.appendChild(imgEditar);
    imgEditar.setAttribute('data-documento', documento);
    tr.append(tdDocumento, tdNombre, tdTelefono, tdRol, tdCorreo, tdUsuario, tdAcciones);

    infoRegistro.append(tr);
  });

  sincronizarLocalStorage();
}

function sincronizarLocalStorage() {
  localStorage.setItem( 'registros', JSON.stringify(registros) );
}