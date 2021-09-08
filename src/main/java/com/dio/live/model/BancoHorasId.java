package com.dio.live.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class BancoHorasId implements Serializable {
    private long idBancoHoras;
    private long idMovimentacao;
    private long idUsuario;
}
