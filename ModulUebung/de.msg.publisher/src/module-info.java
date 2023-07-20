import de.msg.publisher.CharacterPublisher;
import de.msg.publisher.internal.CharacterPublisherImpl;

module de.msg.publisher {

    exports de.msg.publisher;

    uses CharacterPublisher;
    provides CharacterPublisher with CharacterPublisherImpl;

}