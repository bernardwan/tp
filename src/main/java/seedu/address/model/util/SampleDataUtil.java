package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Address;
import seedu.address.model.person.ClassTiming;
import seedu.address.model.person.Email;
import seedu.address.model.person.Location;
import seedu.address.model.person.Name;
import seedu.address.model.person.Nok;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Rate;
import seedu.address.model.person.Student;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Student[] getSamplePersons() {
        return new Student[] {
            new Student(new Name("Alex Yeoh"), new Phone("87438807"), new Email("alexyeoh@example.com"),
                    new Address("Blk 30 Geylang Street 29, #06-40"),
                    new Rate("50"), new ClassTiming("Mon 1pm"),
                    new Location("Blk 30 Geylang Street 29, #06-40"),
                    new Nok(
                            new Name("Bernice Yu"),
                            new Phone("99272758"),
                            new Email("berniceyu@example.com"),
                            new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18")
                    ),
                    getTagSet("friends")),
            new Student(new Name("Bernice Yu"), new Phone("99272758"), new Email("berniceyu@example.com"),
                    new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                    new Rate("50"), new ClassTiming("Mon 2pm"),
                    new Location("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                    new Nok(
                            new Name("Alex Yeoh"),
                            new Phone("87438807"),
                            new Email("alexyeoh@example.com"),
                            new Address("Blk 30 Geylang Street 29, #06-40")
                    ),
                    getTagSet("colleagues", "friends")),
            new Student(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Email("charlotte@example.com"),
                    new Address("Blk 11 Ang Mo Kio Street 74, #11-04"),
                    new Rate("50"), new ClassTiming("Mon 3pm"),
                    new Location("Blk 32 Lorong 4 Serangoon Gardens, #09-10"),
                    new Nok(
                            new Name("Bernice Yu"),
                            new Phone("99272758"),
                            new Email("berniceyu@example.com"),
                            new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18")
                    ),
                    getTagSet("neighbours")),
            new Student(new Name("David Li"), new Phone("91031282"), new Email("lidavid@example.com"),
                    new Address("Blk 436 Serangoon Gardens Street 26, #16-43"),
                    new Rate("50"), new ClassTiming("Mon 4pm"),
                    new Location("Blk 436 Serangoon Gardens Street 26, #16-43"),
                    new Nok(
                            new Name("Bernice Yu"),
                            new Phone("99272758"),
                            new Email("berniceyu@example.com"),
                            new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18")
                    ),
                    getTagSet("family")),
            new Student(new Name("Irfan Ibrahim"), new Phone("92492021"), new Email("irfan@example.com"),
                    new Address("Blk 47 Tampines Street 20, #17-35"),
                    new Rate("50"), new ClassTiming("Mon 5pm"),
                    new Location("Blk 436 Serangoon Gardens Street 26, #16-43"),
                    new Nok(
                            new Name("Bernice Yu"),
                            new Phone("99272758"),
                            new Email("berniceyu@example.com"),
                            new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18")
                    ),
                    getTagSet("classmates")),
            new Student(new Name("Roy Balakrishnan"), new Phone("92624417"), new Email("royb@example.com"),
                    new Address("Blk 45 Aljunied Street 85, #11-31"),
                    new Rate("50"), new ClassTiming("Mon 6pm"),
                    new Location("Blk 45 Aljunied Street 85, #11-31"),
                    new Nok(
                            new Name("Bernice Yu"),
                            new Phone("99272758"),
                            new Email("berniceyu@example.com"),
                            new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18")
                    ),
                    getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Student sampleStudent : getSamplePersons()) {
            sampleAb.addPerson(sampleStudent);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }
}
