grammar markdown;

prog    :   stat+;

stat    :   text
        |   italic
        |   bold
        |   bolditalic
        ;

text    :   TEXT|SPACE;

italic  :   ('*'stat*'*')|('_'stat*'_');

bold    :   ('**'stat*'**')|('__'stat*'__');

bolditalic: ('***' stat* '***');

TEXT    :   [a-zA-Z0-9]+;

SPACE   :   ' ';

WS      :   [\t\r\n]+;

