package br.ufms.cpcx.mauricio.dto;

import br.ufms.cpcx.mauricio.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoJuridicoDTO {

    private Long id;
    private String descricao;
    private Long quantidadeEstoque;
    private BigDecimal precoCompra;
    private BigDecimal precoVendaFisica;

    public static ProdutoJuridicoDTO produtoJuridicoDTO(Produto produto) {

        return new ProdutoJuridicoDTO(
                produto.getId(),
                produto.getDescricao(),
                produto.getQuantidadeEstoque(),
                produto.getPrecoCompra(),
                produto.getPrecoVendaFisica()
        );
    }
}
