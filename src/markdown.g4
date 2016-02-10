grammar markdown;

prog    :   stat+;

stat    :   main_heading
        |   sub_heading
        |   italic
        |   bold
        |   bolditalic
        |   text
        ;

text    :   TEXT|SPACE;

main_heading: text* WS '='+ WS+;

sub_heading : WS? text* WS '-'+ WS+;

italic  :   ('*'stat*'*')|('_'stat*'_');

bold    :   ('**'stat*'**')|('__'stat*'__');

bolditalic: ('***' stat* '***');

TEXT    :   [a-zA-Z0-9]+;

SPACE   :   ' ';

WS      :   [\t\r\n]+;


