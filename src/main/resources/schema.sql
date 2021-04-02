 CREATE TABLE IF NOT EXISTS  public.caseworker
        (
            id integer NOT NULL,
            name character(500) COLLATE pg_catalog."default" NOT NULL,
            email character(500) COLLATE pg_catalog."default" NOT NULL,
            phone character(30) COLLATE pg_catalog."default" NOT NULL,
            CONSTRAINT caseworker_pkey PRIMARY KEY (id)
        )

        TABLESPACE pg_default;

        ALTER TABLE public.caseworker
            OWNER to postgres;

    CREATE TABLE IF NOT EXISTS  public.caseceta
    (
        caseworker integer NOT NULL,
        id integer NOT NULL,
        language character(100) COLLATE pg_catalog."default",
        norton_referral boolean,
        status_notes character(500) COLLATE pg_catalog."default",
        translator boolean NOT NULL,
        caseworker_pcc_status character(500) COLLATE pg_catalog."default" NOT NULL,
        CONSTRAINT case_pkey PRIMARY KEY (id),
        CONSTRAINT "id_caseworker " FOREIGN KEY (caseworker)
            REFERENCES public.caseworker (id) MATCH SIMPLE
            ON UPDATE CASCADE
            ON DELETE CASCADE
    )

    TABLESPACE pg_default;

    ALTER TABLE  public.caseceta
        OWNER to postgres;









            -- Table: public.client_intake

            -- DROP TABLE public.client_intake;

            CREATE TABLE IF NOT EXISTS public.client_intake
            (
                id integer NOT NULL,
                accept boolean NOT NULL,
                case_id integer NOT NULL,
                caseworker integer NOT NULL,
                fjc character(500) COLLATE pg_catalog."default" NOT NULL,
                safe_email boolean NOT NULL,
                safe_phone boolean NOT NULL,
                safe_times character(1) COLLATE pg_catalog."default" NOT NULL,
                preferred_contact character(500) COLLATE pg_catalog."default" NOT NULL,
                device_concerns character(1000) COLLATE pg_catalog."default" NOT NULL,
                account_concerns character(1000) COLLATE pg_catalog."default" NOT NULL,
                general_concerns character(500) COLLATE pg_catalog."default" NOT NULL,
                fluent_languages character(1000) COLLATE pg_catalog."default" NOT NULL,
                pronouns character(500) COLLATE pg_catalog."default" NOT NULL,
                race_ethnicity character(1000) COLLATE pg_catalog."default",
                age character(1) COLLATE pg_catalog."default" NOT NULL,
                caseworker_share boolean NOT NULL,
                research_understand boolean NOT NULL,
                CONSTRAINT "case_id " FOREIGN KEY (case_id)
                    REFERENCES public.caseceta (id) MATCH SIMPLE
                    ON UPDATE CASCADE
                    ON DELETE CASCADE,
                CONSTRAINT "caseworker " FOREIGN KEY (caseworker)
                    REFERENCES public.caseworker (id) MATCH SIMPLE
                    ON UPDATE CASCADE
                    ON DELETE CASCADE
            )

            TABLESPACE pg_default;

            ALTER TABLE public.client_intake
                OWNER to postgres;