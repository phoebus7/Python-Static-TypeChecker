default: lexer parser
	javac -cp .:cup/java-cup-11b-runtime.jar -d src/classes src/java/*.java

lexer:
	jflex src/lexer/lexer.jflex
	mv src/lexer/Lexer.java src/java/
parser:
	java -jar cup/java-cup-11b.jar -dump_tables src/parser/parser.cup
	mv *.java src/java/

clean: 
	rm src/java/parser.java src/java/sym.java src/java/Lexer.java
	rm src/classes/*.class
	rm *.*~
run:
	./run.sh	


