all:
	javac Picmaker.java
	java Picmaker
	convert mandel.ppm mandel.png

clean:
	rm *.ppm
	rm *.png
