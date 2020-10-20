package ui;

import domein.Rekening;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectie_vb {
	public static void main(String[] args) {

		List<Rekening> lijst = Collections.synchronizedList(new ArrayList<>());
		System.out.println(lijst);

	}
}
