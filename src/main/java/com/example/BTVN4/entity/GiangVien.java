package com.example.BTVN4.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GiangVien {

    @NotEmpty(message = "MSGV trong")
    private String maSoGiangVien;
    @NotEmpty(message = "Ten trong")
    private String ten;

    private int tuoi;
    @NotEmpty(message = "Dia chi trong")
    private String diaChi;

    private boolean gioiTinh;
}
