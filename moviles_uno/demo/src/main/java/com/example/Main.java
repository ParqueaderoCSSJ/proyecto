package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.Entidad.Clientes;
import com.example.Entidad.Estacionamientos;
import com.example.Entidad.Facturas;
import com.example.Entidad.Mensualidades;
import com.example.Entidad.Ocasionales;
import com.example.Entidad.Reservas;
import com.example.Entidad.Roles;
import com.example.Entidad.TiposFactura;
import com.example.Entidad.TiposVehiculo;
import com.example.Entidad.Usuarios;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        /////////////////////// Facturas /////////////////////////////////////////
        // createFactura(1, 2, 1, "JPR034", "2024/11/28", 3000, true);
        // Facturas factura = readFactura(1L);
        // TiposFactura tipofactura = readTipoFactura(2L);
        // Clientes cliente = readClientes(1L);
        // TiposVehiculo tipoVehiculo = readTipoVehiculo(1L);
        // if (factura != null) {
        //     System.out.println("Factura número: " + factura.getId() + "\n Placa: " + factura.getPlaca() + "\n Cliente: " + cliente.getNombre() + "\n Fecha Emision: " + factura.getFechaEmision() + "\n Monto: " + factura.getMontoTotal() + "\n Tipo de Factura: " + tipofactura.getTipoFactura() + "\n Tipo Vehiculo: " + tipoVehiculo.getTipoVehiculo());
        // }
        // upDateFactura(1L,1, 1, 1, "JPR050", "2024/11/17", 3000, true);
        // deleteFactura(1L);

        /////////////////////// Mensualidades /////////////////////////////////////////
        // createMensualidad("2024/11/17", "2024/11/18",1,3);
        // Mensualidades Mensualidad = readMensualidad(1L);
        // Estacionamientos estacionamiento = readEstacionamiento(1L);
        // if (Mensualidad != null) {
        //     System.out.println("Mensualidad número: " + Mensualidad.getId() + "\n Fecha Ingreso: " + Mensualidad.getFechaInicial()+ "\n Fecha Ingreso: " + Mensualidad.getFechaSalida() + "\n Estacionamiento: " + estacionamiento.getCodigo());
        // }
        // upDateMensualidad(1L,1, 1, 1, "JPR050", "2024/11/17", 3000, true);
        // deleteFactura(1L);

        /////////////////////// Reservas /////////////////////////////////////////
        // createReservas("2024/11/17", "9:30pm", "12:30pm",1, 2);
        // Reservas reserva = readReservas(1L);
        // Estacionamientos estacionamiento = readEstacionamiento(2L);
        // if (reserva != null) {
        //     System.out.println("Reserva número: " + reserva.getId() + "\n Fecha Reserva: " + reserva.getFechaReserva()+ "\n Hora de  Ingreso: " + reserva.getHoraIngreso() + "\n Hora de  Salida: " + reserva.getHoraSalida() + "\n Estacionamiento: " + estacionamiento.getCodigo() + "\n Factura : " + reserva.getIdFactura());
        // }
        // updateReservas(1L,"2024/11/17", "10:30pm", "12:30pm",1, 2);
        // deleteFactura(1L);

        /////////////////////// Ocasionales /////////////////////////////////////////
        // createOcasional("28/11/2024", "8:30pm", "28/11/2024", "9:30pm",  1);
        // Ocasionales ocasional = readOcasional(1L);
        // if (ocasional != null) {
        // System.out.println("Fecha Inicial: " + ocasional.getFechaInicial() + " " + ocasional.getHoraInicial() + "\nFecha Salida: " + ocasional.getFechaSalida() + " " + ocasional.getHoraSalida() + "\nId Factura: " + ocasional.getIdFactura());
        // }
        // upDateOcasional(1L, "29/10/2025", "9:41am", "29/10/2025", "10:41am");
        // deleteOcasional(1L);

        /////////////////////// Usuarios /////////////////////////////////////////
        // createUsuario("Juan", "1234", 1L, 1L);
        // createUsuario("Camilo", "1234", 3L, 2L);
        // Usuarios usuario = readUsuario(1L);
        // Clientes cliente = readClientes(1L);
        // Roles roll = readRol(1L);
        // if (usuario != null) {
        // System.out.println("Usuario: " + usuario.getUsuario() + "\nContraseña: " + usuario.getContrasena() + "\nCliente: " + cliente.getNombre() + "\nRol: " +roll.getRol());
        // }
        // upDateUsuario(1L, "Juanes", "12345", 1L, 1L);
        // deleteUsuario(1L);

        /////////////////////// Clientes /////////////////////////////////////////
        // createClientes("Juan", "Rodriguez","2558130", "juan@correo.com");
        // createClientes("Camilo", "Perez","34567890'", "camilo@correo.com");
        // Clientes cliente = readClientes(1L);
        // if (cliente != null) {
        //     System.out.println("Nombre: " + cliente.getNombre() + " " +
        //     cliente.getApellido() + "\nTeléfono: " + cliente.getTelefono()+ "\nCorreo: "
        //     + cliente.getCorreo());
        // }
        // upDateClientes(1L, "James", "Rodriguez", "2558131", "james@correo.com");
        // deleteClientes(1L);

        /////////////////////// Estacionamiento         /////////////////////// /////
        // createEstacionamiento("P1P1", "P1", "Ocupado");
        // createEstacionamiento("P1P2", "P1", "Ocupado");
        // createEstacionamiento("P1P3", "P1", "Libre");
        // Estacionamientos estacionamiento = readEstacionamiento(1L);
        // if (estacionamiento != null) {
        // System.out.println("Código: " + estacionamiento.getCodigo() + "\nPiso: " + estacionamiento.getPiso() + "\nEstado: " + estacionamiento.getEstado());
        // }
        // upDateEstacionamiento(1L, "P1P2", "P1", "Libre");
        // deleteEstacionamiento(1L);

        /////////////////////// Roles /////////////////////////////////////////
        // createRol("Admin");
        // createRol("Operario");
        // createRol("Cliente");
        // Roles rol = readRol(1L);
        // if (rol != null) {
        // System.out.println("Tipo de rol: " + rol.getRol());
        // }
        // upDateRol(1L, "Cliente");
        // deleteRoles(1L);

        /////////////////////// Tipos de Factura
        /////////////////////// /////////////////////////////////////////
        // createTipoFactura("Ocacional");
        // createTipoFactura("Reserva");
        // TiposFactura tipoFactura = readTipoFactura(1L);
        // if (tipoFactura != null) {
        // System.out.println("Tipo factura: " + tipoFactura.getTipoFactura());
        // }
        // upDateTipoFactura(1L, "Ocasional");
        // deleteTipoFactura(1L);

        /////////////////////// Tipos de Vehiculo
        /////////////////////// /////////////////////////////////////////
        // createTipoVehiculo("Carro");
        // createTipoVehiculo("Moto");
        // TiposVehiculo tipoVehiculo = readTipoVehiculo(1L);
        // if (tipoVehiculo != null) {
        // System.out.println("Tipo vehiculo: " + tipoVehiculo.getTipoVehiculo());
        // }
        // upDateTipoVehiculo(2L, "Moto");
        // deleteTipoVehiculo(1L);

        em.close();
        emf.close();
    }

    // Facturas
    public static void createFactura(int idCliente, int tipoFactura, int tipoVehiculo, String placa,
            String fechaEmision, double montoTotal, boolean estadoFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Facturas factura = new Facturas();
        factura.setIdCliente(idCliente);
        factura.setTipoFactura(tipoFactura);
        factura.setTipoVehiculo(tipoVehiculo);
        factura.setPlaca(placa);
        factura.setFechaEmision(fechaEmision);
        factura.setMontoTotal(montoTotal);
        factura.setEstadoFactura(estadoFactura);

        em.persist(factura);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Facturas readFactura(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Facturas factura = em.find(Facturas.class, id);

        em.close();

        return factura;
    }

    public static Facturas upDateFactura(Long id, int idCliente, int tipoFactura, int tipoVehiculo, String placa,
            String fechaEmision, double montoTotal, boolean estadoFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Facturas factura = em.find(Facturas.class, id);
        if (factura != null) {
            factura.setIdCliente(idCliente);
            factura.setTipoFactura(tipoFactura);
            factura.setTipoVehiculo(tipoVehiculo);
            factura.setPlaca(placa);
            factura.setFechaEmision(fechaEmision);
            factura.setMontoTotal(montoTotal);
            factura.setEstadoFactura(estadoFactura);
            em.merge(factura); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return factura;
    }

    public static Facturas deleteFactura(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Facturas factura = em.find(Facturas.class, id);
        if (factura != null) {
            em.remove(factura); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return factura;
    }

    // Mensualidad
    public static void createMensualidad(String fechaInicial, String FechaSalida, int idEstacionamiento,
            int idFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Mensualidades Mensualidad = new Mensualidades();
        Mensualidad.setFechaInicial(fechaInicial);
        Mensualidad.setFechaSalida(FechaSalida);
        Mensualidad.setIdEstacionamiento(idEstacionamiento);
        Mensualidad.setIdFactura(idFactura);

        em.persist(Mensualidad);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Mensualidades readMensualidad(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Mensualidades Mensualidad = em.find(Mensualidades.class, id);

        em.close();

        return Mensualidad;
    }

    public static Mensualidades upDateMensualidad(Long id, String fechaInicial, String FechaSalida,
            int idEstacionamiento, int idFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Mensualidades Mensualidad = em.find(Mensualidades.class, id);
        if (Mensualidad != null) {
            Mensualidad.setFechaInicial(fechaInicial);
            Mensualidad.setFechaSalida(FechaSalida);
            Mensualidad.setIdEstacionamiento(idEstacionamiento);
            Mensualidad.setIdFactura(idFactura);
            em.merge(Mensualidad); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return Mensualidad;
    }

    public static Mensualidades deleteMensualidad(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Mensualidades Mensualidad = em.find(Mensualidades.class, id);
        if (Mensualidad != null) {
            em.remove(Mensualidad); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return Mensualidad;
    }

    // Clientes
    public static void createClientes(String nombre, String apellido, String telefono, String correo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Clientes cliente = new Clientes();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setTelefono(telefono);
        cliente.setCorreo(correo);

        em.persist(cliente);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Clientes readClientes(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Clientes cliente = em.find(Clientes.class, id);

        em.close();

        return cliente;
    }

    public static Clientes upDateClientes(Long id, String nombre, String apellido, String Telefono, String correo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Clientes cliente = em.find(Clientes.class, id);
        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setTelefono(Telefono);
            cliente.setCorreo(correo);
            em.merge(cliente); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return cliente;
    }

    public static Clientes deleteClientes(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Clientes cliente = em.find(Clientes.class, id);
        if (cliente != null) {
            em.remove(cliente); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return cliente;
    }

    // Estacionamientos
    public static void createEstacionamiento(String codigo, String piso, String estado) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Estacionamientos estacionamiento = new Estacionamientos();
        estacionamiento.setCodigo(codigo);
        estacionamiento.setPiso(piso);
        estacionamiento.setEstado(estado);

        em.persist(estacionamiento);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Estacionamientos readEstacionamiento(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Estacionamientos estacionamiento = em.find(Estacionamientos.class, id);

        em.close();

        return estacionamiento;
    }

    public static Estacionamientos upDateEstacionamiento(Long id, String codigo, String piso, String estado) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Estacionamientos estacionamiento = em.find(Estacionamientos.class, id);
        if (estacionamiento != null) {
            estacionamiento.setCodigo(codigo);
            estacionamiento.setPiso(piso);
            estacionamiento.setEstado(estado);
            em.merge(estacionamiento); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return estacionamiento;
    }

    public static Estacionamientos deleteEstacionamiento(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Estacionamientos estacionamiento = em.find(Estacionamientos.class, id);
        if (estacionamiento != null) {
            em.remove(estacionamiento); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return estacionamiento;
    }

    // Roles
    public static void createRol(String Rol) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Roles rol = new Roles();
        rol.setRol(Rol);

        em.persist(rol);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Roles readRol(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Roles rol = em.find(Roles.class, id);

        em.close();

        return rol;
    }

    public static Roles upDateRol(Long id, String Rol) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Roles rol = em.find(Roles.class, id);
        if (rol != null) {
            rol.setRol(Rol);
            em.merge(rol); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return rol;
    }

    public static Roles deleteRoles(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Roles rol = em.find(Roles.class, id);
        if (rol != null) {
            em.remove(rol); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return rol;
    }

    // Ocasionales
    public static void createOcasional(String fechaInicial, String horaInicial, String fechaSalida, String horaSalida,
            int idFacura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Ocasionales ocasional = new Ocasionales();
        ocasional.setFechaInicial(fechaInicial);
        ocasional.setHoraInicial(horaInicial);
        ocasional.setFechaSalida(fechaSalida);
        ocasional.setHoraSalida(horaSalida);
        ocasional.setIdFactura(idFacura);

        em.persist(ocasional);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Ocasionales readOcasional(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Ocasionales ocasional = em.find(Ocasionales.class, id);

        em.close();

        return ocasional;
    }

    public static Ocasionales upDateOcasional(Long id, String fechaInicial, String horaInicial, String fechaSalida,
            String horaSalida) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Ocasionales ocasional = em.find(Ocasionales.class, id);
        if (ocasional != null) {
            ocasional.setFechaInicial(fechaInicial);
            ocasional.setHoraInicial(horaInicial);
            ocasional.setFechaSalida(fechaSalida);
            ocasional.setHoraSalida(horaSalida);
            em.merge(ocasional); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return ocasional;
    }

    public static Ocasionales deleteOcasional(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Ocasionales ocasional = em.find(Ocasionales.class, id);
        if (ocasional != null) {
            em.remove(ocasional); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return ocasional;
    }

    // Tipos de factura
    public static void createTipoFactura(String nTipoFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TiposFactura tipofactura = new TiposFactura();
        tipofactura.setTipoFactura(nTipoFactura);

        em.persist(tipofactura);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static TiposFactura readTipoFactura(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        TiposFactura tipoFactura = em.find(TiposFactura.class, id);

        em.close();

        return tipoFactura;
    }

    public static TiposFactura upDateTipoFactura(Long id, String nTipoFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        TiposFactura tipoFactura = em.find(TiposFactura.class, id);
        if (tipoFactura != null) {
            tipoFactura.setTipoFactura(nTipoFactura);
            em.merge(tipoFactura); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return tipoFactura;
    }

    public static TiposFactura deleteTipoFactura(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        TiposFactura tipoFactura = em.find(TiposFactura.class, id);
        if (tipoFactura != null) {
            em.remove(tipoFactura); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return tipoFactura;
    }

    // Tipos de Vehiculo
    public static void createTipoVehiculo(String nTipoVehiculo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TiposVehiculo tipoVehiculo = new TiposVehiculo();
        tipoVehiculo.setTipoVehiculo(nTipoVehiculo);

        em.persist(tipoVehiculo);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static TiposVehiculo readTipoVehiculo(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        TiposVehiculo tipoVehiculo = em.find(TiposVehiculo.class, id);

        em.close();

        return tipoVehiculo;
    }

    public static TiposVehiculo upDateTipoVehiculo(Long id, String nTipoVehiculo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        TiposVehiculo tipoVehiculo = em.find(TiposVehiculo.class, id);
        if (tipoVehiculo != null) {
            tipoVehiculo.setTipoVehiculo(nTipoVehiculo);
            em.merge(tipoVehiculo); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return tipoVehiculo;
    }

    public static TiposVehiculo deleteTipoVehiculo(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        TiposVehiculo tipoVehiculo = em.find(TiposVehiculo.class, id);
        if (tipoVehiculo != null) {
            em.remove(tipoVehiculo); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return tipoVehiculo;
    }

    // Usuarios
    public static void createUsuario(String nUsuario, String contrasena, Long idRol, Long idCliente) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuarios usuario = new Usuarios();
        usuario.setUsuario(nUsuario);
        usuario.setContrasena(contrasena);
        usuario.setIdRol(idRol);
        usuario.setIdCliente(idCliente);

        em.persist(usuario);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Usuarios readUsuario(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Usuarios usuario = em.find(Usuarios.class, id);

        em.close();

        return usuario;
    }

    public static Usuarios upDateUsuario(Long id, String nUsuario, String contrasena, Long idRol, Long idCliente) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Usuarios usuario = em.find(Usuarios.class, id);
        if (usuario != null) {
            usuario.setUsuario(nUsuario);
            usuario.setContrasena(contrasena);
            usuario.setIdRol(idRol);
            usuario.setIdCliente(idCliente);
            em.merge(usuario); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return usuario;
    }

    public static Usuarios deleteUsuario(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Usuarios usuario = em.find(Usuarios.class, id);
        if (usuario != null) {
            em.remove(usuario); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return usuario;
    }

    // Reservas
    public static void createReservas( String fechaReserva, String horaIngreso, String horaSalida,
            int idEstacionamiento, int idFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Reservas reservas = new Reservas();
        reservas.setFechaReserva(fechaReserva);
        reservas.setHoraIngreso(horaIngreso);
        reservas.setHoraSalida(horaSalida);
        reservas.setIdEstacionamiento(idEstacionamiento);
        reservas.setIdFactura(idFactura);

        em.persist(reservas);

        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public static Reservas readReservas(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Reservas reservas = em.find(Reservas.class, id);

        em.close();

        return reservas;
    }

    public static Reservas updateReservas(long id, String fechaReserva, String horaIngreso, String horaSalida,
            int idEstacionamiento, int idFactura) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Reservas reservas = em.find(Reservas.class, id);
        if (reservas != null) {
            reservas.setFechaReserva(fechaReserva);
            reservas.setHoraIngreso(horaIngreso);
            reservas.setHoraSalida(horaSalida);
            reservas.setIdEstacionamiento(idEstacionamiento);
            reservas.setIdFactura(idFactura);
            em.merge(reservas); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return reservas;
    }

    public static Reservas deleterReservas(Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Reservas reservas = em.find(Reservas.class, id);
        if (reservas != null) {
            em.remove(reservas); // Actualizar la entidad
        }
        em.getTransaction().commit();

        em.close();

        return reservas;
    }
}