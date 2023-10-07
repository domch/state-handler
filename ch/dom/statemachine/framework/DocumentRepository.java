package ch.dom.statemachine.framework;

import java.util.UUID;
import ch.dom.statemachine.State;
import ch.dom.statemachine.StateDataHandler;
import ch.dom.statemachine.usecase.Document;
import org.springframework.data.repository.CrudRepository; // Add this import statement

//@Repository
public class DocumentRepository implements CrudRepository<Document, UUID>{
}
