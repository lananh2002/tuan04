package bai8;

public class Bai08_CD {
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private float giaThanh;
	
	
	public Bai08_CD() {
	}


	public Bai08_CD(int maCD, String tuaCD, int soBaiHat, float giaThanh) {
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}


	public int getMaCD() {
		return maCD;
	}


	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}


	public String getTuaCD() {
		return tuaCD;
	}


	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}


	public int getSoBaiHat() {
		return soBaiHat;
	}


	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}


	public float getGiaThanh() {
		return giaThanh;
	}


	public void setGiaThanh(float giaThanh) {
		this.giaThanh = giaThanh;
	}
	
	public void hienThiCD(){
        System.out.printf("%-10d %-20s%-10d %-20.1f \n",maCD,tuaCD,soBaiHat,giaThanh);
    }


	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tuaCD=" + tuaCD + ", soBaiHat=" + soBaiHat + ", giaThanh=" + giaThanh + "]";
	}
	
	
}