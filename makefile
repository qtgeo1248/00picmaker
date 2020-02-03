all:
	javac Picmaker.java
	java Picmaker
	convert mandel.ppm mandel.png
	display mandel.png

clean:
	rm *.ppm
	rm *.png
