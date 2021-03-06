package persistentie;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectStreamManipulaties {

	// Maak methode generiek
	public <E> E leesObject(File naamBestand) {

		try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(naamBestand.toPath()))) {
			return (E) ois.readObject(); // Downcast naar tye want ois geeft object terug.
		}
		// IOException en ClassNotFoundException
		catch (IOException | ClassNotFoundException ex) {
			Logger.getLogger(ObjectStreamManipulaties.class.getName()).log(Level.SEVERE, null, ex);
		}

		return null;
	}

	// Maak methode generiek
	public <E> List<E> leesObjecten(File naamBestand) {
		List<E> li = new ArrayList<>();

		try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(naamBestand.toPath()))) {
			while (true) {
				li.add((E) ois.readObject());
			}
		} catch (EOFException e) {
			return li;
		} catch (IOException | ClassNotFoundException ex) {
			Logger.getLogger(ObjectStreamManipulaties.class.getName()).log(Level.SEVERE, null, ex);
		}

		return null;

	}

}
