package baitap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiangVien {
    String tenGV;
    String email;
    String diaChi;
    String dienThoai;
    int soGio;
}
