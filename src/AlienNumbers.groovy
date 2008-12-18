assert f('9', '0123456789', 'oF8') == 'Foo'
assert f('Foo', 'oF8', '0123456789') == '9'
assert f('13', '0123456789abcdef', '01') == '10011'
assert f('CODE', 'O!CDE?', 'A?JM!.') == 'JAM!'

String f(String val, String s, String t) {
    def c
    int v = 0
    val.reverse().eachWithIndex(){ch,i->v+=s.length()**i*s.indexOf(ch)}
    c={res->r=v%t.length();v=v/t.length();v==0?t[r]:res+t[r]+c(res);}
    return c('').reverse()
}
