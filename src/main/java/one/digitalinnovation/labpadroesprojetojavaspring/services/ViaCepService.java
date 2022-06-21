package one.digitalinnovation.labpadroesprojetojavaspring.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.labpadroesprojetojavaspring.entities.Addresses;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("/{cep}/json/")
    Addresses consultarCep(@PathVariable("cep") String cep);
}