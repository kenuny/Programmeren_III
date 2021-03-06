package persistentie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import domein.Bier;

public class BierMapper {

	public List<Bier> inlezenBieren(String naamBestand) {

		List<Bier> bieren = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get("bieren.txt"))) {

			stream.forEach(regel -> {
				Scanner scanner = new Scanner(regel);
				bieren.add(new Bier(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextDouble(),
						scanner.nextLine().trim()));
			});
		} catch (IOException e) {
			System.out.println("error opgelopen");

		}

		return bieren;

	}

}
