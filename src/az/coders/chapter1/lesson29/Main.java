package az.coders.chapter1.lesson29;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Sample list of data with user information
        List<UserData> data = List.of(
            new UserData("Alice", 10),
            new UserData("Bob", 20),
            new UserData("Alice", 5),
            new UserData("Charlie", 15),
            new UserData("Bob", 25)
        );

        // Group the data by user name
        Map<String, List<UserData>> groupedData = data.stream()
                .collect(Collectors.groupingBy(UserData::getUserName));

        // Print the grouped data
        groupedData.forEach((userName, userDataList) -> {
            System.out.println("User: " + userName);
            userDataList.forEach(userData -> {
                System.out.println("  Value: " + userData.getValue());
            });
        });
    }
}

class UserData {
    private String userName;
    private int value;

    public UserData(String userName, int value) {
        this.userName = userName;
        this.value = value;
    }

    public String getUserName() {
        return userName;
    }

    public int getValue() {
        return value;
    }
}
