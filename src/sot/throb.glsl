uniform float iOvertoneVolume;
void main(void) {
  gl_FragColor = vec4(0.5 + 5.0*iOvertoneVolume,
                      0.5,
                      0.5,
                      1.0);
}
