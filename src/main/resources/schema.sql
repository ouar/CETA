 CREATE TABLE IF NOT EXISTS  public.caseworker
        (
            id integer NOT NULL,
            name VARCHAR COLLATE pg_catalog."default" NOT NULL,
            email VARCHAR COLLATE pg_catalog."default" NOT NULL,
            phone VARCHAR COLLATE pg_catalog."default" NOT NULL,
            CONSTRAINT caseworker_pkey PRIMARY KEY (id)
        )

        TABLESPACE pg_default;

        ALTER TABLE public.caseworker
            OWNER to postgres;

    DROP TABLE IF EXISTS public.client_intake;
    DROP TABLE IF EXISTS public.caseceta;

    CREATE TABLE IF NOT EXISTS  public.caseceta
    (
        caseworker integer NOT NULL,
        id integer NOT NULL,
        language VARCHAR COLLATE pg_catalog."default",
        norton_referral boolean,
        status_notes VARCHAR COLLATE pg_catalog."default",
        translator boolean NOT NULL,
        caseworker_pcc_status VARCHAR COLLATE pg_catalog."default" NOT NULL,
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

            DROP TABLE IF EXISTS public.client_intake;

            CREATE TABLE IF NOT EXISTS public.client_intake
            (
                id integer NOT NULL,
                accept boolean NOT NULL,
                case_id integer NOT NULL,
                fjc VARCHAR COLLATE pg_catalog."default" NOT NULL,
                safe_email boolean NOT NULL,
                safe_phone boolean NOT NULL,
                safe_times VARCHAR COLLATE pg_catalog."default" NOT NULL,
                preferred_contact VARCHAR COLLATE pg_catalog."default" NOT NULL,
                device_concerns VARCHAR COLLATE pg_catalog."default" NOT NULL,
                account_concerns VARCHAR COLLATE pg_catalog."default" NOT NULL,
                general_concerns VARCHAR COLLATE pg_catalog."default" NOT NULL,
                fluent_languages VARCHAR COLLATE pg_catalog."default" NOT NULL,
                pronouns VARCHAR COLLATE pg_catalog."default" NOT NULL,
                race_ethnicity VARCHAR COLLATE pg_catalog."default",
                age VARCHAR COLLATE pg_catalog."default" NOT NULL,
                caseworker_share boolean NOT NULL,
                research_understand boolean NOT NULL,
                CONSTRAINT "case_id " FOREIGN KEY (case_id)
                    REFERENCES public.caseceta (id) MATCH SIMPLE
                    ON UPDATE CASCADE
                    ON DELETE CASCADE

            )

            TABLESPACE pg_default;

            ALTER TABLE public.client_intake
                OWNER to postgres;