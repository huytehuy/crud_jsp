package com.example.demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class NhanVienController {
    private NhanVien nhanvien;

    private NhanVienMapper nhanvienMapper;

    public String create() {
        nhanvienMapper.save(nhanvien);
        return "success";
    }

    public String read() {
        nhanvien = nhanvienMapper.findById(1); // Lấy sản phẩm có id = 1
        return "success";
    }

    public String update() {
        nhanvienMapper.update(nhanvien);
        return "success";
    }

    public String delete() {
        nhanvienMapper.delete(1); // Xóa sản phẩm có id = 1
        return "success";
    }

}
