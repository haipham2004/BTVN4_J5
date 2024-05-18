package com.example.BTVN4.service;

import com.example.BTVN4.entity.GiangVien;

import java.util.ArrayList;
import java.util.List;

public class GiangVienService {

    private List<GiangVien> listSV = new ArrayList<>();

    public GiangVienService() {
        listSV.add(new GiangVien("SV01", "Haha1", 19, "Ninh Binh", true));
        listSV.add(new GiangVien("SV02", "Haha2", 20, "Ninh Binh", true));
        listSV.add(new GiangVien("SV03", "Haha3", 20, "Ninh Binh", false));
        listSV.add(new GiangVien("SV04", "Haha4", 20, "Ninh Binh", false));
        listSV.add(new GiangVien("SV05", "Haha5", 20, "Ninh Binh", false));
    }

    public List<GiangVien> getAll() {
        return listSV;
    }

    public GiangVien getOne(String mssv) {

        for (GiangVien sinhVien : listSV) {
            if (sinhVien.getMaSoGiangVien().equalsIgnoreCase(mssv)) {
                return sinhVien;
            }
        }
        return null;
    }

    public void add(GiangVien sinhVien) {
        listSV.add(sinhVien);
    }

    public void update(GiangVien sinhVienUpdate) {
        for (GiangVien sinhVien : listSV) {
            if (sinhVien.getMaSoGiangVien().equalsIgnoreCase(sinhVien.getMaSoGiangVien())) {
                sinhVien.setTen(sinhVienUpdate.getTen());
                sinhVien.setDiaChi(sinhVienUpdate.getDiaChi());
                sinhVien.setTuoi(sinhVienUpdate.getTuoi());
                sinhVien.setGioiTinh(sinhVienUpdate.isGioiTinh());
            }
        }
    }

    public void delete(String mssv) {
        for (int i = 0; i < listSV.size(); i++) {
            if (listSV.get(i).getMaSoGiangVien().equalsIgnoreCase(mssv)) {
                listSV.remove(i);
            }
        }
    }
}
