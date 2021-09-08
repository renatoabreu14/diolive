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
public class MovimentacaoId implements Serializable {

    private long idMovimento;
    private long idUsuario;
}
