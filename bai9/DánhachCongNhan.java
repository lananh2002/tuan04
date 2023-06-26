package bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCongNhan {
	private ArrayList<CongNhan>dsCongNhan;
	public DanhSachCongNhan() {
		dsCongNhan = new ArrayList<CongNhan>();
	}
	public void themCongNhan(int mMa, String mHo, String mTen, int mSoSP) {
		dsCongNhan.add(new CongNhan(mMa, mHo, mTen, mSoSP));
	}
	public int getSoLuongCongNhan() {
		return dsCongNhan.size();
	}
	public void xoaCongNhan(int mMa) {
				dsCongNhan.removeIf(dsCongNhan -> dsCongNhan.getmMa()== mMa);
	}
	public String layDSCongNhan() {
		String s = "";
		for(int i=0;i<dsCongNhan.size();i++) {
			if(dsCongNhan.get(i).getmSoSP()>200)
				s+=dsCongNhan.get(i);
		}
		return s;
	}
	public void sortDSCN () {
		Comparator<CongNhan> id = Comparator.comparingInt(CongNhan::getmSoSP);
		Collections.sort(dsCongNhan, id.reversed());
	}
	public String getTitle() {
		return String.format("%-5s%-10s%-15s%-10s%-10s\n","Mã", "Họ", "Tên","Số SP", "Lương");
	}
	public String toString() {
		String s = "";
		for (CongNhan i : dsCongNhan) {
			s+=i;
		}
		return getTitle()+s;
	}
}
