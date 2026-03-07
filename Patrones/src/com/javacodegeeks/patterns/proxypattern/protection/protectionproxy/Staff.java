package com.javacodegeeks.patterns.proxypattern.protection.protectionproxy;

public interface Staff {

	public boolean isOwner();
	public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
