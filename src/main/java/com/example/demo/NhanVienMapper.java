package com.example.demo;

import java.util.List;

public interface NhanVienMapper {

    NhanVien findById(int id);

    List<NhanVien> findAll();

    void save(NhanVien nhanvien);

    void update(NhanVien nhanvien);

    void delete(int id);

}

