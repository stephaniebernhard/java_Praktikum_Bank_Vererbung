# java_Praktikum_Bank_Vererbung

Eine Bank bietet drei Arten von Konten an: „normale“ Bankkonten, Salärkonten und Nummernkonten.
Die Eigenschaften sind nachfolgend beschrieben:
- Jedes Konto hat einen Inhaber (ein String) und einen aktuellen Kontostand.
- Es darf höchstens ein Maximalbetrag von CHF 100'000 auf einem Konto sein.
- Das Salärkonto darf als einziges überzogen werden. Dazu hat es eine Überzugslimite, welche im
Bereich 0 bis maximal CHF 10'000 liegt.
- Es kann Geld auf ein Konto einbezahlt werden. Würde der Kontostand dadurch den Maximalbetrag
überschreiten, wird nur soviel einbezahlt, wie noch erlaubt ist.
- Es kann Geld von einem Konto abgehoben werden. Der Kontostand darf dadurch nicht negativ
bzw. beim Salärkonto nicht unter die Überzugslimite fallen. Falls dies so wäre, so wird nur die erlaubte
Geldmenge abgehoben.
- Ein Nummernkonto hat nebst dem Inhaber zusätzlich eine Nummer. Diese beginnt für das erste
Nummernkonto bei 1000 und wird für weitere Nummernkonten fortlaufend um 1 erhöht (1001,
1002...).
- Bei allen Konten kann der Inhaber und der Kontostand abgefragt werden. Beim Nummernkonto
wird bei der Abfrage des Inhabers nicht der Name, sondern die Nummer geliefert. Bei Salärkonten
kann man auch die Überzugslimite abfragen.
- Beim Erzeugen eines Kontos wird der Inhaber angegeben und optional eine Ersteinlage (Kontostand
zu Beginn). Bei Salärkonten wird zudem die Überzugslimite spezifiziert.
Ihre Aufgabe ist es, die angeboten Konten unter Berücksichtigung der Anforderungen in einer geeigneten
Vererbungshierarchie umzusetzen. Schreiben Sie zudem eine Klasse, welche eine Bank simuliert.
Dabei sollen mehrere Konten der verschiedenen Typen erzeugt werden, Geld einbezahlt und
abgehoben werden und die Konten sollen ausgegeben werden. Verwalten Sie alle erzeugten Konten
in derselben Datenstruktur. Überprüfen Sie insbesondere auch, ob die Limiten korrekt eingehalten
werden. Die Ausgabe soll in etwa wie folgt aussehen (jeweils für ein Bankkonto, ein Salärkonto und
ein Nummernkonto):
Inhaber: Jolly Jumper, Kontostand: 30000.0
Inhaber: Donald Duck, Kontostand: -2000.0, Ueberzugslimite: 5000.0
Inhaber: 1000, Kontostand: 100000.0
Hinweis zur Umsetzung:
- Verwalten Sie Konto-intern den Kontostand am besten in Rappen (int). Damit vermeiden Sie allfällige
Präzisionsprobleme mit Gleitkommazahlen. Die Methoden und Konstruktoren sollen aber bei
den Parametern und Rückgabewerten Beträge in Franken verwenden. Um effizient zwischen
Franken und Rappen zu konvertieren, verwenden Sie am besten zwei Konto-interne Methoden.
