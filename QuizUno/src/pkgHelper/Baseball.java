package pkgHelper;

public class Baseball {
	private String Name;
	private int Hits;
	private int ABs;
	private int Doubles;
	private int Triples;
	private int HRs;
	private int Runs;
	private int BBs;
	
	public Baseball(String n,int ab,int h,int dub,int tri,int hr,int r,int bb) {
		this.Name= n;
		this.Hits = h;
		this.ABs = ab;
		this.Doubles= dub;
		this.Triples = tri;
		this.HRs = hr;
		this.Runs = r;
		this.BBs = bb;
	}
	public double battingAverage() {
		return (double)Hits / ABs;
	}
	public double OBP() {
		return ((double)Hits+BBs)/(ABs + BBs);
	}
	public double slug() {
		double singles = (double) Hits - Doubles-Triples-HRs;
		return (Doubles*2 + Triples*3 + HRs*4 +singles)/ABs;
	}
	public double onBasePlusSlug(){
		return OBP() + slug();
	}
	public int totalBases() {
		int singles = Hits - Doubles-Triples-HRs;
		return Doubles*2 + Triples*3 + HRs*4 + singles;
	}
	public String toString() {
		return Name+"'s stats\nBatting Average: "
				+String.format("%.3f",battingAverage())+"\nOBP: "+String.format("%.3f",OBP())+"\nSLG: "+String.format("%.3f",slug())
				+"\nOPS: "+String.format("%.3f",onBasePlusSlug())+"\nTotal Bases: "+totalBases();
	}
}