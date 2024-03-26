# FROM gcc:latest

# COPY . /usr/src/MusicPlayer

# WORKDIR  /usr/src/MusicPlayer

# RUN apt-get update
# # apt-get install libglfw3-dev -y
# # RUN apt-get install net-tools -y
# RUN apt-get install gnome-browser-connector -y
# CMD gnome-browser-connector
# RUN apt-get install -y xauth

# RUN xauth add 0733cbebc14b99e985758cba93f69edc

# RUN make

# RUN chmod +x ./output/main

# CMD [ "./bin/imgui-test" ]


FROM jlesage/baseimage-gui:alpine-3.15-v4

# Install xterm.
RUN add-pkg xterm

# Copy the start script.
COPY startapp.sh /startapp.sh

# Set the name of the application.
RUN set-cont-env APP_NAME "Xterm"