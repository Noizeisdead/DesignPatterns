FROM gcc:latest

COPY . /usr/src/MusicPlayer

WORKDIR  /usr/src/MusicPlayer

RUN apt-get update &&  apt-get install libgl-dev -y

RUN make 

RUN chmod +x ./output/main

CMD [ "chmod +x ./output/main", "./output/main" ]


