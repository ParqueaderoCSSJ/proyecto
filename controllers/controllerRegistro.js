import { registros } from "../models/modelRegistro.js";

const formulario = document.querySelector('#formularioRegistro');
const btnGuardar = document.querySelector('#btnGuardar');

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
  const roll = document.querySelector('#Rol') !== null ? document.querySelector('#Rol').value : 'usuario' ;
  const user = document.querySelector('#Usuario').value;
  const password = document.querySelector('#Contrasena').value;
  const confirmar = document.querySelector('#Confirmar').value;
  
  if(tipoDocumento !== '' && documento !== '' && nombre !== '' && radioSexo !== null && apellido !== '' && telefono !== '' && correo !== '' && roll !== '' && user !== '' && password !== '' && confirmar !== '') {
    if( password === confirmar ) {
      const usuarioObj = {
        tipoDocumento,
        documento,
        nombre,
        radioSexo: radioSexo.value, 
        apellido,
        telefono,
        correo,
        roll,
        user,
        password
      }
      validacionDuplicados( usuarioObj );  
    } else {
      alertSuccess("Las contraseñas deben de ser iguales", false);
    }
  } else {
    alertSuccess("Complete todos los campos", false);
  }
}

function validacionDuplicados( usuarioObj ) {
  const encontradoDocumento = registros.some( usuario => usuario.documento === usuarioObj.documento );
  const encontradoUser = registros.some( usuario => usuario.user === usuarioObj.user );
  const encontradoEmail = registros.some( usuario => usuario.correo === usuarioObj.correo );

  if( encontradoDocumento ) {
    alertSuccess('Documento de identidad ya existe', false);
    return;
  }
  if( encontradoUser ) {
    alertSuccess('Usuario ya existe', false);
    return;
  }
  if( encontradoEmail ) {
    alertSuccess('Email ya existe', false);
    return;
  }

  agregarUsuario(usuarioObj);
}

function agregarUsuario(usuarioObj) {
  registros.push(usuarioObj);
  formulario.reset();
  alertSuccess('El usuario fue creado exitosamente!', true);
  
  sincronizarLocalStorage();
}

function sincronizarLocalStorage() {
  localStorage.setItem( 'registros', JSON.stringify(registros) );
}