package med.voll.api.domain.endereco;

import jakarta.validation.constraints.NotNull;

public record DadosEndereco(
        @NotNull
        String logradouro,
        @NotNull
        String bairro,
        @NotNull
        String cep,
        @NotNull
        String cidade,
        @NotNull
        String uf,
        String complemento,
        String numero) {
}
