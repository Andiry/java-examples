CC = javac
CLIB = -cp *.jar *.java

SRCS = $(wildcard *.java)
BUILD = $(patsubst %.java, %.class, $(SRCS))

all: $(BUILD)

%.class: %.java
	$(CC)  $<  $(CLIB)

clean:
	rm -rf *.class
