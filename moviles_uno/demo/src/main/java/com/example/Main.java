package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.Entidad.Facturas;
import com.example.Entidad.Mensualidades;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        // createFactura(1, 1, 1, "JPR034", "2024/11/17", 3000, true);
        // Facturas factura = readFactura(1L);
        // if (factura != null) {
        //     System.out.println("Factura número: " + factura.getId() + "\n Placa: " + factura.getPlaca());
        // }
        // upDateFactura(1L,1, 1, 1, "JPR050", "2024/11/17", 3000, true);
        // deleteFactura(1L);
        /////////////////////// Mensualidades /////////////////////////////////////////
        createMensualidad("2024/11/17", "2024/11/18",1,1);
        // Mensualidades Mensualidad = readMensualidad(1L);
        // if (Mensualidad != null) {
        //     System.out.println("Mensualidad número: " + Mensualidad.getId() + "\n Fecha Ingreso: " + Mensualidad.getFechaInicial()+ "\n Fecha Ingreso: " + Mensualidad.getFechaSalida());
        // }
        // upDateMensualidad(1L,1, 1, 1, "JPR050", "2024/11/17", 3000, true);
        // deleteFactura(1L);

        em.close();
        emf.close();
    }
    //Facturas
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
    public static Facturas readFactura (Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Facturas factura = em.find(Facturas.class, id);

        em.close();

        return factura;
    }
    public static Facturas upDateFactura (Long id, int idCliente, int tipoFactura, int tipoVehiculo, String placa,
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
    //Mensualidad
    public static void createMensualidad(String fechaInicial, String FechaSalida, int idEstacionamiento, int idFactura) {
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
    
    public static Mensualidades readMensualidad (Long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        EntityManager em = emf.createEntityManager();

        Mensualidades Mensualidad = em.find(Mensualidades.class, id);

        em.close();

        return Mensualidad;
    }
    public static Mensualidades upDateMensualidad (Long id, String fechaInicial, String FechaSalida, int idEstacionamiento, int idFactura) {
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
    public static Mensualidades deleteMensualidad (Long id) {
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
}