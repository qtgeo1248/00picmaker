all:
	javac Picmaker.java
	java Picmaker

clean:
	rm *.ppm
	rm *.png
