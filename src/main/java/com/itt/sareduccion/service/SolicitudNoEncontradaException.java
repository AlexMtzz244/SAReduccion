package com.itt.sareduccion.service;

/**
 * La solicitud no existe o no pertenece al solicitante (HTTP 404). Se usa el
 * mismo error en ambos casos para no revelar que ids existen.
 */
public class SolicitudNoEncontradaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public SolicitudNoEncontradaException(String message) {
        super(message);
    }
}
