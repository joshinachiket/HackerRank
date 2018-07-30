import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Runner {
	public static List<Integer> monthList31 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

	public boolean knowMyBirthday(Birthday birthday, Birthday sysDate) {

		// exit condition 1
		// if birthday year is in future
		if (birthday.year > sysDate.year)
			return false;

		// a simple general condition
		// first check the month as year can be anything
		if (birthday.month == sysDate.month) {
			// if months are equal we have to check if the day is same
			if (birthday.day == sysDate.day) {
				// this means the day and the month are same so dont have to add
				// 24 hours
				// lets decide addition of 24 hours by a flag and another
				// function
				//System.out.println("111");
				return compareDates(birthday, sysDate, false);

			} else if (sysDate.day - birthday.day == 1) {
				// this means that the current sysdate is one greater than the
				// birthday
				// we canadd 24 hours here
				return compareDates(birthday, sysDate, true);
			} else {
				return false;
			}
		} else if (birthday.month == 12 && sysDate.month == 1) {
			// lets check when birthday month is December
			if (birthday.day == 31 && sysDate.day == 1) {
				return compareDates(birthday, sysDate, true);
			}

			return false;
		} else if (sysDate.month - birthday.month == 1) {
			// check if the birthday month is feb
			if (birthday.month == 2) {
				if (birthday.day == 29) {

					if (sysDate.day == 1) {
						return compareDates(birthday, sysDate, false);
					} else if (sysDate.day == 2) {
						return compareDates(birthday, sysDate, true);
					}
					return false;

				}

				// check for leap year
				if (isLeapYear(sysDate.year)) {
					return false;
				} else if (sysDate.day == 1 && birthday.day == 28) {
					return compareDates(birthday, sysDate, true);
				} else {
					return false;
				}
			} else if (monthList31.contains(birthday.month)) {
				// check if birthday is in 31 days month
				System.out.println("111");
				if (sysDate.day == 1 && birthday.day == 31) {
					return compareDates(birthday, sysDate, true);
				} else {
					return compareDates(birthday, sysDate, false);
				}
			} else {
				if (sysDate.day == 1 && birthday.day == 30) {
					return compareDates(birthday, sysDate, true);
				} else {
					return compareDates(birthday, sysDate, false);
				}
			}

		} else {
			return false;
		}

	}

	public boolean isLeapYear(int year) {
		// TODO Auto-generated method stub
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean compareDates(Birthday birthday, Birthday sysDate, boolean addDay) {
		// TODO Auto-generated method stub
		int secondsBirthday = birthday.hr * 60 * 60 + birthday.min * 60 + birthday.sec;
		int secondsSysDate = sysDate.hr * 60 * 60 + sysDate.min * 60 + sysDate.sec;

		if (addDay) {
			secondsSysDate += 24 * 60 * 60;
		}

		// check if the time of the sysdate is not earlier than the birthday
		// time
		if (secondsSysDate - secondsBirthday > 0 && secondsSysDate - secondsBirthday < (24 * 60 * 60)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {

		String date = "2018-06-04T21:04:35Z";

		Birthday birthday = new Birthday(date);

		System.out.println("User Entered: " + date);

		Date now = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

		String sysDate = dateFormat.format(now).toString();
		System.out.println("Current System Date is: " + sysDate);
		Birthday currentDate = new Birthday(sysDate);

		Runner object = new Runner();

		System.out.println(object.knowMyBirthday(birthday, currentDate));

	}

}
