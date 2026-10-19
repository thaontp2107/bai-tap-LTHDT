package baitapkethua;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Candidate 
{
    protected  String hoten;
    protected Date ngaysinh;
    protected String diachi;
    protected String quequan;
    protected String sdt;
    protected String email;

    public Candidate() {}

    public Candidate(String hoten, Date ngaysinh, String diachi, String quequan, String sdt, String email) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.quequan = quequan;
        this.sdt = sdt;
        this.email = email;
    }

    public String getHoTen() {
        return hoten;
    }

    public Date getNgaySinh() {
        return ngaysinh;
    }

    public String getDiaChi() {
        return diachi;
    }

    public String getQueQuan() {
        return quequan;
    }

    public String getSDT() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaySinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDiaChi(String diachi) {
        this.diachi = diachi;
    }

    public void setSDT(String sdt) {
        this.sdt = sdt;
    }    

    public void setEmail(String email) {
        this.email = email;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ho va ten: ");
        this.hoten=sc.nextLine();
        System.out.print("Ngày sinh: "); 
        try{         
            SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");        
            this.ngaysinh=d.parse(sc.nextLine());        
        }
        catch(Exception ex){}
        System.out.print("nhap dia chi: ");
        this.diachi=sc.nextLine();
        System.out.print("Nhap que quan: ");
        this.quequan = sc.nextLine();
        System.out.print("nhap sdt: ");
        this.sdt=sc.nextLine();
        System.out.print("nhap email: ");
        this.email=sc.nextLine();
    }  
    
    public void xuat()
    {
        System.out.println("ho va ten:"+this.hoten);
        System.out.println("ngay thang nam sinh:"+this.ngaysinh);
        System.out.println("dia chi:"+this.diachi);
        System.out.println("que quan:"+this.quequan);
        System.out.println("so dien thoai:"+this.sdt);
        System.out.println("dia chi email:"+this.email);

    }
}

class Experience extends Candidate {
    protected int namkn;
    protected String kncm;
    protected String noilvgn;

    public Experience() {
        super();
    }

    public Experience(int namkn, String kncm, String noilvgn) {
        super();
        this.namkn = namkn;
        this.kncm = kncm;
        this.noilvgn = noilvgn;
    }

    @Override
    public void nhap() {
        super.nhap(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nam kinh nghiem: ");
        this.namkn = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ky nang chuyen mon: ");
        this.kncm = sc.nextLine();
        System.out.print("Nhap noi lam viec gan nhat: ");
        this.noilvgn = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Nam kinh nghiem: " + this.namkn);
        System.out.println("Ky nang chuyen mon: " + this.kncm);
        System.out.println("Noi lam viec gan nhat: " + this.noilvgn);
    }
}

class Fresher extends Candidate {
    protected Date tdtn;
    protected String xeploai;
    protected String truong;

    public Fresher() {
        super();
    }

    public Fresher(Date tdtn, String xeploai, String truong) {
        super();
        this.tdtn = tdtn;
        this.xeploai = xeploai;
        this.truong = truong;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi diem tot nghiep: ");
        try {
            SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
            this.tdtn = d.parse(sc.nextLine());
        }
        catch (Exception ex) {
        }
        System.out.print("Nhap xep loai tot nghiep: ");
        this.xeploai = sc.nextLine();
        System.out.print("Nhap truong tot nghiep: ");
        this.truong = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thoi diem tot nghiep: " + this.tdtn);
        System.out.println("Xep loai tot nghiep: " + this.xeploai);
        System.out.println("Truong tot nghiep: " + this.truong);
    }
}

class Intern extends Candidate {
    protected String chuyennganh;
    protected int hocki;
    protected String truong;
    protected String ngaydktn;

    public Intern() {
        super();
    }

    public Intern(String chuyennganh, int hocki, String truong, String ngaydktn) {
        super();
        this.chuyennganh = chuyennganh;
        this.hocki = hocki;
        this.truong = truong;
        this.ngaydktn = ngaydktn;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuyen nganh: ");
        this.chuyennganh = sc.nextLine();
        System.out.print("Nhap hoc ki dang hoc: ");
        this.hocki = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap truong dang hoc: ");
        this.truong = sc.nextLine();
        System.out.print("Nhap ngay du kien tot nghiep: ");
        this.ngaydktn = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen nganh: " + this.chuyennganh);
        System.out.println("Hoc ki dang hoc: " + this.hocki);
        System.out.println("Truong dang hoc: " + this.truong);
        System.out.println("Ngay du kien tot nghiep: " + this.ngaydktn);
    }
}

class LTHDT {
    public static void main(String[] args) {
        
        System.out.println("NHAP THONG TIN UNG VIEN EXPERIENCE ");
        Experience exp = new Experience();
        exp.nhap();
        
        System.out.println("\n");
        System.out.println("THONG TIN UNG VIEN EXPERIENCE VUA NHAP:");
        exp.xuat();

        System.out.println("\nNHAP THONG TIN UNG VIEN FRESHER");
        Fresher fre = new Fresher();
        fre.nhap();
        
        System.out.println("\n");
        System.out.println("THONG TIN UNG VIEN FRESHER VUA NHAP:");
        fre.xuat();

        System.out.println("\n\nNHAP THONG TIN UNG VIEN INTERN ");
        Intern intern = new Intern();
        intern.nhap();
        
        System.out.println("\n");
        System.out.println("THONG TIN UNG VIEN INTERN VUA NHAP:");
        intern.xuat();
    }
} 