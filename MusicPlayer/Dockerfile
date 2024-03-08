FROM gcc:latest

COPY . /usr/src/MusicPlayer

WORKDIR  /usr/src/MusicPlayer

RUN make

CMD [ "./output/main" ]