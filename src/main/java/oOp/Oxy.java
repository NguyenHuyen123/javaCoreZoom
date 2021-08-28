package oOp;

public class Oxy {
    private int ox, oy;

    public Oxy(int ox, int oy) {
        this.ox = ox;
        this.oy = oy;
    }


    @Override
    public String toString() {
        return "A(" + this.ox + "," + this.oy + ")";
    }

    public boolean isOrigin() {
        if (this.ox == 0 && this.oy == 0) {
            return true; // là gốc tọa độ
        } else {
            return false; // Không phải gốc tọa độ
        }
    }

    public double distance(Oxy o) {// tính khoảng cách 2 điểm
        double x = Math.pow(this.ox - o.ox, 2);
        double y = Math.pow(this.oy - o.oy, 2);
        double result = Math.sqrt(x + y);
        return result;
    }

    public void symmetryOx() { //tìm điểm đối xứng qua  trục hoành
        int x = this.ox;
        int y = -this.oy;
        System.out.println(toString() + " =>" + "A(" + x + "," + y + ")");

    }

    public void symmetryOy() { //tìm điểm đối xứng qua  trục tung
        int x = -this.ox;
        int y = this.oy;
        System.out.println(toString() + " =>" + "A(" + x + "," + y + ")");

    }

    public void symmetryO() { //tìm điểm đối xứng qua gỗ tọa độ
        int x = -this.ox;
        int y = -this.oy;
        System.out.println(toString() + " =>" + "A(" + x + "," + y + ")");

    }

    public void quarterOxy() {
        if (isOrigin() == true) {
            System.out.println(toString() + "Là gốc tọa độ");
        } else if (this.ox > 0 && this.oy > 0) {
            System.out.println(toString() + " Là phần tư I");
        } else if (this.ox < 0 && this.oy < 0) {
            System.out.println(toString() + " Là phần tư III");
        } else if (this.ox < 0 && this.oy > 0) {
            System.out.println(toString() + " Là phần tư II");
        } else
            System.out.println(toString() + " Là phần tư IV");

    }


}
