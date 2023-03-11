package com.app.repositories;

public class EmailMessageRepository {
	public static String passwordChangeOTPEmail(String name, String oTP) {
		String message = "Dear "+name+",\r\n"
				+"Please use the below One Time Password (OTP) to reset your password. This will be valid for 15 minutes only.\r\n"
				+ "One Time Password (OTP) : "+oTP+"\r\n"
				+"If you are unable to change the password within 15 minutes of OTP generation, please click on \"Forgot Password\" and continue with the same process again.\r\n"
				+ "Wish you all the best!\r\n"
				+ "Note: Use Chrome browser for best experience. \r\n"
				+ "Regards\r\n"
				+ "Campus Recruitment Team\r\n"
				+ "SP Solutions in India\r\n"
				+ "Please note, that unless a formal employment offer is provided to candidate specifically determining the terms of employment with SP Solutions, nothing contained in an email or any identified processes for the purpose of candidate’s participation in the interview process shall be considered as an offer for employment by SP Solutions notwithstanding any contents or communications mentioned in process documents or links.\r\n"
				+ "Please be further informed that existence of an offer or offering any employment to a candidate shall be subject to business needs within SP Solutions or client requirements; mere clearance of any processes related to campus hiring does not by itself create an offer of employment for the candidate."
				+"";
		return message;
	}
	
	public static String shortlistedForNextProcedureEmail(String name) {
		String message = "Hi "+name+",\r\n"
				+ "\r\n"
				+ "Thank you for exploring a career at SP Solutions.\r\n"
				+ "\r\n"
				+ "Congratulations! You have advanced to the next stage of our hiring process. You will receive further notifications on our assessments and their schedule. \r\n"
				+ "\r\n"
				+ "Ensure you read the instructions carefully before attempting these assessments. The assessments will be conducted in two stages:\r\n"
				+ "\r\n"
				+ "Stage 1: Cognitive and Technical assessment, followed by Coding assessment\r\n"
				+ "\r\n"
				+ "Stage 2: Communication assessment\r\n"
				+ "\r\n"
				+ "As you prepare to appear for the assessments, please ensure that the below academic documents are in place to expedite your application based on your progress in future stages of our recruiting process.\r\n"
				+ "\r\n"
				+ "B.E/B.Tech graduates – marksheets from Semester I to VI during recruiting process. While onboarding all semester marksheets and provisional degree certificate/ degree certificate\r\n"
				+ "M.E / M.Tech/ Dual Degree (B.Tech + M.Tech) / MCA graduates – marksheets from Semester I and II during recruiting process. While onboarding all semester marksheets and provisional degree certificate/ degree certificate\r\n"
				+ "We also accept online results or internet copies of marksheets provided by the university\r\n"
				+ "To help your readiness, here are our logistics requirements for taking our assessments online;\r\n"
				+ "\r\n"
				+ "Laptop/ Desktop requisites:\r\n"
				+ "\r\n"
				+ "Laptop/ desktop must be enabled with webcam and microphone. Webcam should capture image clearly. Both webcam and microphone must be in switch-on mode across all assessments and interview stages of our process\r\n"
				+ "Avoid using mobile devices such as mobile phones and tablets\r\n"
				+ "RAM & Processor: 4 GB+ RAM, i3 5th Generation 2.2 Ghz or equivalent/ higher\r\n"
				+ "Operating system: Windows 8 or 10\r\n"
				+ "Google Chrome browser, Version 5 (Latest)\r\n"
				+ " Internet Connectivity:\r\n"
				+ "Stable Internet connection of 2Mbps+ enabled through broadband connection, do avoid unstable 3G/4G networks\r\n"
				+ "VPN/Proxy should be disabled\r\n"
				+ "For taking communication assessment:\r\n"
				+ "\r\n"
				+ "Its highly recommended to use a USB enabled Headset with a microphone, or a good quality headset with single jack – 3.5 mm having microphone\r\n"
				+ "Students must avoid using Bluetooth headsets or using on system speakers and microphone\r\n"
				+ "Stay tuned for more details about these assessments.\r\n"
				+ "\r\n"
				+ "Wishing you best,\r\n"
				+ "\r\n"
				+ "If you are facing any technical issues during assessments or the interview rounds, please call us on  +91-6366937447 or use the Chat box given on the Help page. \r\n"
				+ "\r\n"
				+ "Regards\r\n"
				+ "Campus Recruitment Team\r\n"
				+ "SP Solutions in India\r\n"
				+ "\r\n"
				+ "Please note, that unless a formal employment offer is provided to candidate specifically determining the terms of employment with SP Solutions, nothing contained in an email or any identified processes for the purpose of candidate’s participation in the interview process shall be considered as an offer for employment by SP Solutions notwithstanding any contents or communications mentioned in process documents or links.\r\n"
				+ "\r\n"
				+ "Please be further informed that existence of an offer or offering any employment to a candidate shall be subject to business needs within SP Solutions or client requirements; mere clearance of any processes related to campus hiring does not by itself create an offer of employment for the candidate.";
		return message;
	}
	
	public static String shortlistedForInterviewEmail(String name, String date, String time) {
		String message = "Dear "+ name +", \r\n"
				+ "\r\n"
				+ "Congratulations! You have advanced to the next stage of our hiring process. Your interview will be conducted on "+ date+" at "+ time + "\r\n"
				+ "\r\n"
				+ "Ensure that you login and be present at the virtual interview lobby 15 minutes prior to our interview process.\r\n"
				+ "\r\n"
				+ "System requirements to attend the interview:\r\n"
				+ "\r\n"
				+ "Laptop/ desktop must be enabled with webcam and microphone. Webcam should capture image clearly. Both webcam and microphone must be in switch-on mode across all assessments and interview stages of our process.\r\n"
				+ "RAM & Processor: 4 GB+ RAM, i3 5th Generation 2.2 Ghz or equivalent/ higher.\r\n"
				+ "Operating system: Windows 8 or 10 only.\r\n"
				+ "Google Chrome browser, version 88 (upto 5 latest versions).\r\n"
				+ "Stable Internet connection of 2Mbps+ enabled through broadband connection, do avoid unstable 3G/4G networks.\r\n"
				+ "VPN/Proxy should be disabled.\r\n"
				+ "\r\n"
				+ "A few things to keep in mind:\r\n"
				+ "\r\n"
				+ "Ensure you are in a room which does not have any disturbance (background noise, people or external sounds).\r\n"
				+ "Ensure you have power supply and uninterrupted data connectivity to your system – since each stage of assessments must be taken without any interval. \r\n"
				+ "You will have to login with your Candidate ID (CID) or with QR code available in your admit card for attending interview. \r\n"
				+ "You will be in our interview lobby till your notified on initiating your discussions\r\n"
				+ "You will have to promptly action by acknowledging our consent and complete system check before attending the virtual interview discussions.";
		return message;
	}
}
