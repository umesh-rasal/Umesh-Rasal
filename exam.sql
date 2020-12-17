truncate table tempp;
declare
	intr number;
	amt number;
	p number;
	r number;
	t number;	
begin
	p := &principle;
	r := &rate;
	t := &interest;
 
	intr := (p * t * r) / 100;
	amt := p + intr;

	dbms_output.put_line('Interest = ' || intr);
	dbms_output.put_line('Total amount = ' || amt);
end;
/