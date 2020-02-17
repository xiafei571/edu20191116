package edu20191116.day1.vo;

public class UserOnOff {
	public static final int OPTIONS_NOTIFYPRAISE = 1;

	public static final int OPTIONS_NOTIFYCOMMENT = 1 << 1;

	public static final int OPTIONS_NOTIFYFORWARD = 1 << 2;

	public static final int OPTIONS_NOTIFYAT = 1 << 3;

	public static final int OPTIONS_FOLLOWING = 1 << 4;

	public static final int OPTIONS_NOTIFYSYSTEM = 1 << 5;

	// newUser.setOnOff(UserOnOff.OPTIONS_NOTIFYALL);
	public static final int OPTIONS_NOTIFYALL = OPTIONS_NOTIFYPRAISE | OPTIONS_NOTIFYCOMMENT | OPTIONS_NOTIFYFORWARD
			| OPTIONS_NOTIFYAT | OPTIONS_FOLLOWING | OPTIONS_NOTIFYSYSTEM;

	private int value;

	public UserOnOff(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void switchOptionsNotifypraise() {
		if (isOptionsNotifypraise()) {
			this.value = ~OPTIONS_NOTIFYPRAISE & value;
		} else {
			this.value = value | OPTIONS_NOTIFYPRAISE;
		}
	}

	public boolean isOptionsNotifypraise() {
		return (OPTIONS_NOTIFYPRAISE & value) == OPTIONS_NOTIFYPRAISE;
	}

	public void switchOptionsNotifycomment() {
		if (isOptionsNotifycomment()) {
			this.value = ~OPTIONS_NOTIFYCOMMENT & value;
		} else {
			this.value = value | OPTIONS_NOTIFYCOMMENT;
		}
	}

	public boolean isOptionsNotifycomment() {
		return (OPTIONS_NOTIFYCOMMENT & value) == OPTIONS_NOTIFYCOMMENT;
	}

	public void switchOptionsNotifyforward() {
		if (isOptionsNotifyforward()) {
			this.value = ~OPTIONS_NOTIFYFORWARD & value;
		} else {
			this.value = value | OPTIONS_NOTIFYFORWARD;
		}
	}

	public boolean isOptionsNotifyforward() {
		return (OPTIONS_NOTIFYFORWARD & value) == OPTIONS_NOTIFYFORWARD;
	}

	public void switchOptionsNotifyat() {
		if (isOptionsNotifyat()) {
			this.value = ~OPTIONS_NOTIFYAT & value;
		} else {
			this.value = value | OPTIONS_NOTIFYAT;
		}
	}

	public boolean isOptionsNotifyat() {
		return (OPTIONS_NOTIFYAT & value) == OPTIONS_NOTIFYAT;
	}

	public void switchOptionsFollowing() {
		if (isOptionsFollowing()) {
			this.value = ~OPTIONS_FOLLOWING & value;
		} else {
			this.value = value | OPTIONS_FOLLOWING;
		}
	}

	public boolean isOptionsFollowing() {
		return (OPTIONS_FOLLOWING & value) == OPTIONS_FOLLOWING;
	}

	public void switchOptionsNotifysystem() {
		if (isOptionsNotifysystem()) {
			this.value = ~OPTIONS_NOTIFYSYSTEM & value;
		} else {
			this.value = value | OPTIONS_NOTIFYSYSTEM;
		}
	}

	public boolean isOptionsNotifysystem() {
		return (OPTIONS_NOTIFYSYSTEM & value) == OPTIONS_NOTIFYSYSTEM;
	}

	public static void main(String[] args) {
		System.out.println(OPTIONS_NOTIFYPRAISE | OPTIONS_NOTIFYCOMMENT | OPTIONS_NOTIFYFORWARD);
	}
}
