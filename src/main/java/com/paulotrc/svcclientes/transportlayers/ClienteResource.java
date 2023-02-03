package com.paulotrc.svcclientes.transportlayers;

import com.paulotrc.svcclientes.entites.Cliente;
import com.paulotrc.svcclientes.transportlayers.resources.ClienteResourceI;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClienteResource implements ClienteResourceI {

    @Override
    public ResponseEntity<Cliente> get(
            @Parameter(name = "cpf", description = "Número do CPF do Cliente", required = true)
            @PathVariable("cpf") long cpf
    ) {
        return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
    }
}
