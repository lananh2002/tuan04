package bai9;

public class CongNhan {
	private int mMa;
	private String mHo;
	private String mTen;
	private int mSoSP;
	public CongNhan(int mMa, String mHo, String mTen, int mSoSP) {
		this.mMa = mMa;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	public CongNhan() {
		this.mMa = 0;
		this.mHo = "chua co";
		this.mTen = "chua co";
		this.mSoSP = 0;
	}
	public int getmMa() {
		return mMa;
	}
	public void setmMa(int mMa) {
		this.mMa = mMa;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		this.mSoSP = mSoSP;
	}
	public double tinhLuong() {
		if(mSoSP>0&&mSoSP<200)return mSoSP*0.5;
		else if(mSoSP<400)return mSoSP*0.55;
		else if(mSoSP<600)return mSoSP*0.6;
		else return mSoSP*0.65;
	}
	public String toString() {
		return String.format("%-5d%-10s%-15s%-10d%-10.2f\n", mMa, mHo, mTen,mSoSP, tinhLuong());
}
}
