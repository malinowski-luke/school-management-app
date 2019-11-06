package model.Person;

import java.util.Random;

public enum Major {
	ACC, BUS, MKT, RET, AUT, CYB, COT, DRF, ELT, ENS, FPT, 
	TYT, CHI, CIN, COM, DNC, DMA, ENG, FRE, GER, GRD, HUM, 
	INT, ITL, JPN, LAT, MUS, MTR, PHL, ART, SPN, THR, WST, 
	HIS, SOC, ASL, CDC, DTE, PAR, PFS, HSC, MED, HIT, HUS, 
	NUR, OTA, PED, PTA, PNU, AST, BIO, CHE, ESC, ENV, MAR,
	MAT, MET, PHY, ANT, ECO, GEO, POL, PSY, COL, CSE, CRJ,
	CUL, EDU, ESL, HVA, HRM, CST, IND, LAW, LIB, MFT, POA, 
	RTV, RDG, VST;
	
	public static Major generateMajor(){
		Random rand = new Random();
		return values()[rand.nextInt(values().length)];
	}
}

