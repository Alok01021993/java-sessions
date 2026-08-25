package sdetprograms;

public class ReversedAndReplacedWithoutStringMethod {
	 public static void main(String[] args) {
	 // Given string as char array — ALL UPPERCASE — no String class used
    char[] name = {'Y','A','S','H','A','S','H','W','I',' ','A','L','O','K'};

    // Step 1: Find length manually using for loop
    int length = 0;
    for (char c : name) {
        length++;
    }

    // Print Original
    System.out.print("Original name  : ");
    for (int i = 0; i < length; i++) {
        System.out.print(name[i]);
    }
    System.out.println();

    // Step 2: Convert uppercase to lowercase using ASCII
    // 'A' = 65, 'a' = 97 → difference = 32
    // So adding 32 to uppercase gives lowercase
    char[] lower = new char[length];
    for (int i = 0; i < length; i++) {
        if (name[i] >= 'A' && name[i] <= 'Z') {
            lower[i] = (char)(name[i] + 32);  // convert to lowercase
        } else {
            lower[i] = name[i];                // keep space as it is
        }
    }

    // Print Lowercase
    System.out.print("Lowercase name : ");
    for (int i = 0; i < length; i++) {
        System.out.print(lower[i]);
    }
    System.out.println();

    // Step 3: Reverse the lowercase char array using for loop
    char[] reversed = new char[length];
    for (int i = 0; i < length; i++) {
        reversed[i] = lower[length - 1 - i];  // pick from end
    }

    // Print Reversed
    System.out.print("Reversed name  : ");
    for (int i = 0; i < length; i++) {
        System.out.print(reversed[i]);
    }
    System.out.println();

    // Step 4: Replace 'a' with '@' using for loop
    char[] replaced = new char[length];
    for (int i = 0; i < length; i++) {
        if (reversed[i] == 'a') {
            replaced[i] = '@';          // replace 'a' with '@'
        } else {
            replaced[i] = reversed[i];  // keep as it is
        }
    }

    // Print Replaced
    System.out.print("Replaced name  : ");
    for (int i = 0; i < length; i++) {
        System.out.print(replaced[i]);
    }
    System.out.println();
}
}


